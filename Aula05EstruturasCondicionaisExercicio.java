package avancado.medio.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main (String[] args){
        //Criar um programa que retorne a taxa de impostos a ser paga com base no salário;
        double salaryAnual = 52000;
        double ate38400 = 9.7;
        double ate76800 = 37.35;
        double maisQue76800 = 49.50;
        double impostoPgto = salaryAnual / 100;
        String percentualImposto = "";
        if (salaryAnual > 0 && salaryAnual <= 38400){
            percentualImposto = "O imposto a ser pago será 9.70% a.a.";
            System.out.println(percentualImposto+" e o valor a ser pago será de "+impostoPgto * ate38400);
        } else if (salaryAnual > 38400 && salaryAnual <= 76800){
            percentualImposto = "O imposto a ser pago será de 37.35% a.a.";
            System.out.println(percentualImposto+" e o valor a ser pago será de "+impostoPgto * ate76800);
        } else if (salaryAnual > 76800) {
            percentualImposto = "O imposto a ser pago será de 49.50% a.a.";
            System.out.println(percentualImposto+" e o valor a ser pago será de "+impostoPgto * maisQue76800);
        }
    }
}
