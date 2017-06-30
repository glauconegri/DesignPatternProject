package factorypattern;

public class FactoryEx {

	public Pessoa getGender(final String nome, final String sexo){
		
		if("M".equalsIgnoreCase(sexo)){
			return new Homem(nome); 
		} else if("F".equalsIgnoreCase(sexo)){
			return new Mulher(nome);
		}

		return null;
	}
	
}
