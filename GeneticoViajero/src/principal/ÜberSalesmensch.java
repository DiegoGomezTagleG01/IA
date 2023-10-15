package principal;
import java.util.*;

public class ÜberSalesmensch {
    private int generationSize;
    private int genomeSize;
    private int numberOfCities;
    private int reproductionSize;
    private int maxIterations;
    private float mutationRate;
    private int tournamentSize;
    private SelectionType selectionType;
    private int[][] travelPrices;
    private int startingCity;
    private int targetFitness;

    public ÜberSalesmensch(int numberOfCities, SelectionType selectionType, int[][] travelPrices, int startingCity, int targetFitness){
        this.numberOfCities = numberOfCities;
        this.genomeSize = numberOfCities-1;
        this.selectionType = selectionType;
        this.travelPrices = travelPrices;
        this.startingCity = startingCity;
        this.targetFitness = targetFitness;

        generationSize = 5000;
        reproductionSize = 200;
        maxIterations = 1000;
        mutationRate = 0.1f;
        tournamentSize = 40;
    }

    public List<vendedor> initialPopulation(){
        List<vendedor> population = new ArrayList<>();
        for(int i=0; i<generationSize; i++){
            population.add(new vendedor(numberOfCities, travelPrices, startingCity));
        }
        return population;
    }

    public List<vendedor> selection(List<vendedor> population){
        List<vendedor> selected = new ArrayList<>();
        vendedor winner;
        for(int i=0; i<reproductionSize; i++){
            if(selectionType == SelectionType.ROULETTE){
                selected.add(rouletteSelection(population));
            }
            else if(selectionType == SelectionType.TOURNAMENT){
                selected.add(tournamentSelection(population));
            }
        }

        return selected;
    }

    public vendedor rouletteSelection(List<vendedor> population){
        int totalFitness = population.stream().map(vendedor::getFitness).mapToInt(Integer::intValue).sum();
        Random random = new Random();
        int selectedValue = random.nextInt(totalFitness);
        float recValue = (float) 1/selectedValue;
        float currentSum = 0;
        for(vendedor genome : population){
            currentSum += (float) 1/genome.getFitness();
            if(currentSum>=recValue){
                return genome;
            }
        }
        int selectRandom = random.nextInt(generationSize);
        return population.get(selectRandom);
    }

    public static <E> List<E> pickNRandomElements(List<E> list, int n) {
        Random r = new Random();
        int length = list.size();

        if (length < n) return null;

        for (int i = length - 1; i >= length - n; --i)
        {
            Collections.swap(list, i , r.nextInt(i + 1));
        }
        return list.subList(length - n, length);
    }

    public vendedor tournamentSelection(List<vendedor> population){
        List<vendedor> selected = pickNRandomElements(population,tournamentSize);
        return Collections.min(selected);
    }

    public vendedor mutate(vendedor ven){
        Random random = new Random();
        float mutate = random.nextFloat();
        if(mutate<mutationRate) {
            List<Integer> genome = ven.getGenome();
            Collections.swap(genome, random.nextInt(genomeSize), random.nextInt(genomeSize));
            return new vendedor(genome, numberOfCities, travelPrices, startingCity);
        }
        return ven;
    }

    public List<vendedor> createGeneration(List<vendedor> population){
        List<vendedor> generation = new ArrayList<>();
        int currentGenerationSize = 0;
        while(currentGenerationSize < generationSize){
            List<vendedor> parents = pickNRandomElements(population,2);
            List<vendedor> children = crossover(parents);
            children.set(0, mutate(children.get(0)));
            children.set(1, mutate(children.get(1)));
            generation.addAll(children);
            currentGenerationSize+=2;
        }
        return generation;
    }

    public List<vendedor> crossover(List<vendedor> parents){
        // housekeeping
        Random random = new Random();
        int breakpoint = random.nextInt(genomeSize);
        List<vendedor> children = new ArrayList<>();

        // copy parental genomes - we copy so we wouldn't modify in case they were
        // chosen to participate in crossover multiple times
        List<Integer> parent1Genome = new ArrayList<>(parents.get(0).getGenome());
        List<Integer> parent2Genome = new ArrayList<>(parents.get(1).getGenome());

        // creating child 1
        for(int i = 0; i<breakpoint; i++){
            int newVal;
            newVal = parent2Genome.get(i);
            Collections.swap(parent1Genome,parent1Genome.indexOf(newVal),i);
        }
        children.add(new vendedor(parent1Genome,numberOfCities,travelPrices,startingCity));
        parent1Genome = parents.get(0).getGenome(); // reseting the edited parent

        // creating child 2
        for(int i = breakpoint; i<genomeSize; i++){
            int newVal = parent1Genome.get(i);
            Collections.swap(parent2Genome,parent2Genome.indexOf(newVal),i);
        }
        children.add(new vendedor(parent2Genome,numberOfCities,travelPrices,startingCity));

        return children;
    }

    public vendedor optimize(){
        List<vendedor> population = initialPopulation();
        vendedor globalBestGenome = population.get(0);
        for(int i=0; i<maxIterations; i++){
            List<vendedor> selected = selection(population);
            population = createGeneration(selected);
            globalBestGenome = Collections.min(population);
            if(globalBestGenome.getFitness() < targetFitness)
                break;
        }
        return globalBestGenome;
    }

    public void printGeneration(List<vendedor> generation ){
        for( vendedor genome : generation){
            System.out.println(genome);
        }
    }
}
