
import java.util.Date;

import entities.Request;
import entities.enums.OrderStatus;

public class RequestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Request request = new Request(1080, new Date(), OrderStatus.shipped);
		//Enums são objetos que podem ter mais de um determinado de estado pré definido
		//ex: pedido feito, pedido enviado, pedido entregue, Segue um padrão
		System.out.println(request);
		
		//Convertendo string para enum e vice versa
		
		OrderStatus os1 = OrderStatus.delivered;
		
		OrderStatus os2 = OrderStatus.valueOf("delivered");
		//Não se pode colocar mais de um valor
		System.out.println(os1);
		System.out.println(os2);
		
		
	}

}
