package principal;

import Rule.*;

/**
 *
 * @author Alvaro
 */
public class Base_Reglas {
    
    public String opcion1(String renuncia, String arreglo) {
        base_de_conocimiento();

        renuncia_despido.setValue(renuncia);
        existe_arreglo.setValue(arreglo);

        baseDeReglas.forwardChain();

        System.out.println(renuncia_despido.getValue() + " " + existe_arreglo.getValue() + " " + resultado1.getValue());
        return resultado1.getValue();
    }

    public String setDatos(
        String renuncia_despido,
        String justificado_injustificado,
        String existe_arreglo,
        String alta_IMSS,
        String existe_contrato,
        String comprobar_relacion,
        String desicion_tribunal,
        String tiempo_minimo,
        String tomo_vacaciones
    ) {
        base_de_conocimiento();
                
        this.renuncia_despido.setValue(renuncia_despido);
        this.justificado_injustificado.setValue(justificado_injustificado);
        this.existe_arreglo.setValue(existe_arreglo);
        this.alta_IMSS.setValue(alta_IMSS);
        this.existe_contrato.setValue(existe_contrato);
        this.comprobar_relacion.setValue(comprobar_relacion);
        this.desicion_tribunal.setValue(desicion_tribunal);
        this.tiempo_minimo.setValue(tiempo_minimo);
        this.tomo_vacaciones.setValue(tomo_vacaciones);
        
        baseDeReglas.forwardChain();
        
        return resultado1.getValue();
    }

    BooleanRuleBase baseDeReglas = new BooleanRuleBase("baseDeReglas");

    RuleVariable renuncia_despido;
    RuleVariable justificado_injustificado;
    RuleVariable existe_arreglo;
    RuleVariable alta_IMSS;
    RuleVariable existe_contrato;
    RuleVariable comprobar_relacion;
    RuleVariable desicion_tribunal;
    RuleVariable tiempo_minimo;
    RuleVariable tomo_vacaciones;

    RuleVariable resultado1,
            resultado_arreglo,
            resultado_pago;

    public void base_de_conocimiento() {
        renuncia_despido = new RuleVariable(baseDeReglas, "");
        existe_arreglo = new RuleVariable(baseDeReglas, "");
        justificado_injustificado = new RuleVariable(baseDeReglas, "");
        alta_IMSS = new RuleVariable(baseDeReglas, "");
        existe_contrato = new RuleVariable(baseDeReglas, "");
        comprobar_relacion = new RuleVariable(baseDeReglas, "");
        desicion_tribunal = new RuleVariable(baseDeReglas, "");
        tiempo_minimo = new RuleVariable(baseDeReglas, "");
        tomo_vacaciones = new RuleVariable(baseDeReglas, "");

        resultado1 = new RuleVariable(baseDeReglas, "s");

        resultado_arreglo = new RuleVariable(baseDeReglas, "");

        Condition igual = new Condition("=");

        Rule regla_uno = new Rule(baseDeReglas, "regla_uno",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Renuncia"),
                    new Clause(existe_arreglo, igual, "Si")},
                new Clause(resultado1, igual, "Acuerdo: Se puede Seguir con el acuerdo ya que por ambas partes \n "
                        + "estan de acuerdo con una forma de Pago \n que no requiere consulta legal")
                
        );

        Rule regla_dos = new Rule(baseDeReglas, "regla_dos",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Renuncia"),
                    new Clause(existe_arreglo, igual, "No")},
                new Clause(resultado1, igual, "Sin resposabilidad: El patron no tiene responsabilidad de indemnizar\n "
                        + "al empleado ya que  el empleado Renuncio a su puesto")
        );  

        Rule regla_tres = new Rule(baseDeReglas, "regla_tres",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Justificada"),
                    new Clause(existe_arreglo, igual, "Si")},
                new Clause(resultado1, igual, "Acuerdo: Aunque haya una justificación, se puede\n"
                        + " llegar a un acuerdo con el patron para una indemnizacion")
        );

        Rule regla_cuatro = new Rule(baseDeReglas, "regla_cuatro",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Justificada"),
                    new Clause(existe_arreglo, igual, "No")},
                new Clause(resultado1, igual, "Sin resposabilidad: El patron no tiene responsabilidad de indemnizar\n "
                        + "al empleado ya que  el empleado fue\n dado de baja dentro de las normativas de la \n empresa")
        );

        ///////////////////////////
        Rule regla_cinco = new Rule(baseDeReglas, "regla_cinco",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Injustificada"),
                    new Clause(alta_IMSS, igual, "Si"),
                    new Clause(existe_contrato, igual, "Si")
                    
                    
                    
                },
                //new Clause(resultado1, igual, "pago_patron_IMSS")
                new Clause(resultado1, igual, "pago_patron")
        );
        

        Rule regla_cinco_1 = new Rule(baseDeReglas, "regla_cinco_1",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Injustificada"),
                    new Clause(alta_IMSS, igual, "Si"),
                    new Clause(existe_contrato, igual, "No"),
                    new Clause(existe_arreglo, igual, "Si")
                },
                new Clause(resultado1, igual, "Pago opcional del patron: Al no existir \n un contrato y estar dado de alta en el IMSS \n"
                        + "el patron no se ve obligado a indemnizar , sin embargo,\n sus correspondientes pagos del IMSS son obligatorios")
        );

        Rule regla_cinco_2 = new Rule(baseDeReglas, "regla_cinco_2",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Injustificada"),
                    new Clause(alta_IMSS, igual, "Si"),
                    new Clause(existe_contrato, igual, "No"),
                    new Clause(existe_arreglo, igual, "No")
                    
                },
                new Clause(resultado1, igual, "Pago IMSS: Al no existir un contrato y/o arreglo \n"
                        + "pero si estar dado de alta en el IMSS se debe\npedir los correspondientes pagos de la misma")
        );
        //////////////////////////
        Rule regla_seis = new Rule(baseDeReglas, "regla_seis",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Injustificada"),
                    new Clause(alta_IMSS, igual, "No"),
                    new Clause(existe_contrato, igual, "Si"),
                    
                },
                new Clause(resultado1, igual, "pago_patron")
        );
        /////////////////////////
        Rule regla_siete = new Rule(baseDeReglas, "regla_siete",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Injustificada"),
                    new Clause(alta_IMSS, igual, "No"),
                    new Clause(existe_contrato, igual, "No"),
                    new Clause(comprobar_relacion, igual, "Si"),
                    new Clause(desicion_tribunal, igual, "Si")

                },
                new Clause(resultado1, igual, "pago_patron")
        );

        Rule regla_siete_uno = new Rule(baseDeReglas, "regla_siete_uno",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Injustificada"),
                    new Clause(alta_IMSS, igual, "No"),
                    new Clause(existe_contrato, igual, "No"),
                    new Clause(comprobar_relacion, igual, "Si"),
                    new Clause(desicion_tribunal, igual, "No")

                },
                new Clause(resultado1, igual, "Sin Pago: No se puede forzar un pago ya\n"
                        + " que no hay intencion de luchar por una indemnización")
        );
//
//        Rule ocho = new Rule(baseDeReglas, "regla_siete_uno",
//                new Clause[]{
//                    new Clause(renuncia_despido, igual, "Despido"),
//                    new Clause(justificado_injustificado, igual, "Injustificada"),
//                    new Clause(alta_IMSS, igual, "No"),
//                    new Clause(existe_contrato, igual, "No"),
//                    new Clause(comprobar_relacion, igual, "No")
//                },
//                new Clause(resultado1, igual, "No hay pago")
//        );

        Rule nueve = new Rule(baseDeReglas, "regla_siete_uno",
                new Clause[]{
                    new Clause(renuncia_despido, igual, "Despido"),
                    new Clause(justificado_injustificado, igual, "Injustificada"),
                    new Clause(alta_IMSS, igual, "No"),
                    new Clause(existe_contrato, igual, "No"),
                    new Clause(comprobar_relacion, igual, "No")
                },
                new Clause(resultado1, igual, "Sin Pago: No se puede pedir una indemnización \n ya que se trata de un trabajo"
                        + "\n en el que no existe un contrato ni manera de comprobar una relación laboral")
        );

        Rule regla_diez = new Rule(baseDeReglas, "regla_diez",
                new Clause[]{
                    new Clause(resultado1, igual, "pago_patron"),
                    new Clause(tiempo_minimo, igual, "Si")
                },
                new Clause(resultado1, igual, "pago_patron_100")
        );

        Rule regla_diez_1 = new Rule(baseDeReglas, "regla_diez_1",
                new Clause[]{
                    new Clause(resultado1, igual, "pago_patron"),
                    new Clause(tiempo_minimo, igual, "No")
                },
                new Clause(resultado1, igual, "pago_patron_proporcioanl")
        );

        Rule regla_once = new Rule(baseDeReglas, "regla_once",
                new Clause[]{
                    new Clause(resultado1, igual, "pago_patron_100"),
                    new Clause(tomo_vacaciones, igual, "Si")

                },
                new Clause(resultado1, igual, "Pago Patron del 100% sin prima: Se le debe asignar \n"
                        + "una indemnizacion completa sin prima vacacional")
        );

        Rule regla_doce = new Rule(baseDeReglas, "regla_doce",
                new Clause[]{
                    new Clause(resultado1, igual, "pago_patron_100"),
                    new Clause(tomo_vacaciones, igual, "No")
                },
                new Clause(resultado1, igual, "Pago Patron del 100% sin prima: Se le debe asignar \n"
                        + "una indemnizacion completa con prima vacacional")
        );

        Rule regla_trece = new Rule(baseDeReglas, "regla_trece",
                new Clause[]{
                    new Clause(resultado1, igual, "pago_patron_proporcioanl"),
                    new Clause(tomo_vacaciones, igual, "No")
                },
                new Clause(resultado1, igual, "Pago Patron Proporcional con prima: Se le debe asignar \n"
                        + "un pago proporcional al tiempo de trabajo con derecho a prima vacacional")
        );

        Rule regla_catorce = new Rule(baseDeReglas, "regla_catorce",
                new Clause[]{
                    new Clause(resultado1, igual, "pago_patron_proporcioanl"),
                    new Clause(tomo_vacaciones, igual, "Si")
                },
                new Clause(resultado1, igual, "Pago Patron Proporcional sin prima: Se le debe asignar \n"
                        + "un pago proporcional al tiempo de trabajo sin derecho prima vacacional")
        );

    }
}
