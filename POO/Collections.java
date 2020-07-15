package POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        Collection<String> estoque = new ArrayList();

        int menu;
        String produto, novo;

        do
        {
            System.out.println("-------------------------- MENU -------------------------- ");
            System.out.println(" 1 - Adicionar");
            System.out.println(" 2 - Remover");
            System.out.println(" 3 - Alterar");
            System.out.println(" 3 - Listar");
            System.out.println("-------------------------- FIM MENU -------------------------- ");
            menu = ler.nextInt();

            if(menu == 1)
            {
                System.out.println("Digite o produto para adicionar: ");
                produto = ler.next();
                estoque.add(produto);
            }

            else if(menu == 2)
            {
                System.out.println("Digite o produto para remover: ");
                produto = ler.next();
                estoque.remove(produto);
            }

            else if(menu == 3)
            {
                System.out.println("Digite o novo valor: ");
                novo = ler.next();

                System.out.println("Digite o produto que para substituir: ");
                produto = ler.next();

                if(estoque.contains(produto))
                {
                    estoque.remove(produto);
                    estoque.add(novo);
                }
            }

            else if(menu == 4)
                System.out.println("Produtos do estoque: " + estoque + "\n");

            else
                System.out.println("Escolha errada!");
        }
        while(menu != 0);
    }
}