package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.dto.MateriaDTO;
import main.dto.StatusEnum;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<MateriaDTO> resultadosAnteriores = new ArrayList<>();

      boolean repetir = true;
      while (repetir) {
         System.out.print("Digite o nome da matéria: ");
         String nomeMateria = scanner.nextLine();

         System.out.print("Digite a nota da prova: ");
         double notaProva = scanner.nextDouble();

         System.out.print("Digite a nota do PIM: ");
         double notaPIM = scanner.nextDouble();

         System.out.print("Digite a nota do AVA: ");
         double notaAVA = scanner.nextDouble();

         double media = ((notaProva * 7) + (notaPIM * 2) + (notaAVA)) / 10;

         StatusEnum status = (media >= 5.7) ? StatusEnum.APROVADO : StatusEnum.REPROVADO;

         System.out.println("A média é: " + media + " - " + status.toString() + "\n");

         resultadosAnteriores.add(new MateriaDTO(nomeMateria, media, status));

         System.out.print("Deseja repetir a operação? (S/N): ");
         String opcao = scanner.next();
         scanner.nextLine();

         repetir = opcao.equalsIgnoreCase("S");
      }

      System.out.println("\n Resultados anteriores: \n");
      for (MateriaDTO materia : resultadosAnteriores) {
         System.out.println("| " + materia.getNomeMateria() + " - média = " + materia.getMedia() + " - " + materia.getStatus()
                            + " |");
      }
   }
}
