package resultado;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import loja.ImportedProduct;
import loja.Product;
import loja.UsedProduct;

public class ProdutoEscolhido {


	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// formatação da data

		List<Product> list = new ArrayList<>();//Iniciando a lista

		System.out.println("Entre com numero de produtos: ");
		int n = sc.nextInt();// Ler a qtd de produtos a ser add

		for (int i = 1; i <= n; i++) { // for para ler a qtd de produto add
			System.out.println("Product #" + i + " data:"); // O + i + q vai salvar na lista q é o 1* produto
			System.out.print("O produto é (c/u/i)");
			char type = sc.next().charAt(0);// criamos uma variavel para ler o caracter c/u/i
			System.out.print("Nome do produto: ");
			sc.nextLine(); // fazemos isso para consumir a quebra de linha
			String name = sc.nextLine();//Recebe o nome
			System.out.print("Valor do produto: ");
			double price = sc.nextDouble();//Recebe o valor
			if (type == 'c') { // if para add os produtos na lista
					list.add(new Product(name, price)); // add os itens na lista usando a class Product
			} else if (type =='u'){ 
				// Aqui instanciamos o funcionario
				System.out.print("Digite a data (DD/MM/YYYY) de fabricação do produto:  ");
				Date date = sdf.parse(sc.next());// formato para receber a data	
				list.add(new UsedProduct(name, price, date));// add os itens na lista usando a class UsedProduct
			}
			else {// ler a opção i de 
				System.out.println("Resumo");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));// add os itens na lista usando a class ImportedProduct
			}
		}
		System.out.println();//Consumindo a quebra de linha
		System.out.println("Price Tag:s");
		for (Product prod : list) {
			System.out.println(prod.priceTag());// prod é o for q vai ler a lista. priceTag foi escrito e sobrescrita em 1 String  
		}										// para ser exibida de formas diferentes.
		sc.close();
	}
}
