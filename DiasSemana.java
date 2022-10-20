package atividade3;

public class DiasSemana {
public static void main(String[] args) {
	int dia = 7;
	int diaSemana = 3;
	
	System.out.println("Os dias da semana sao:");
	
	for(int i=0; i < dia; i++) {
		
		if(i == 1) {
			System.out.println("Segunda-feira");
		}
		if(i==2) {
			System.out.println("Terca-feira");
		}
		if(i==3) {
			System.out.println("Quarta-feira");
		}
		if(i==4) {
			System.out.println("Quinta-feira");
		}
		if(i==5) {
			System.out.println("Sexta-feira");
		}
		if(i==6) {
			System.out.println("Sabado-feira");
		}
		if(i==7) {
			System.out.println("Domingo-feira");
		}
		
			
	}
	switch(diaSemana) {
	case 1:
		System.out.println("O dia selecionado foi a segunda-feira");
		break;
	case 2:
		System.out.println("O dia selecionado foi a terça-feira");
		break;
	case 3:
		System.out.println("O dia selecionado foi a quarta-feira");
		break;
	case 4:
		System.out.println("O dia selecionado foi a quinta-feira");
		break;
	case 5:
		System.out.println("O dia selecionado foi a sexta-feira");
		break;
	case 6:
		System.out.println("O dia selecionado foi o sabado");
		break;
	case 7:
		System.out.println("O dia selecionado foi o domingo");
		break;
	}
	
}

}
