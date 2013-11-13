import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.ufrn.ect.progcorp.CustoManagerRemoteBusiness;
import br.ufrn.ect.progcorp.model.Custo;


@ManagedBean
public class TesteMB {

	@EJB
	CustoManagerRemoteBusiness ejb;
	
	public String teste() {
		
		Custo c = new Custo();
		c.setDescricao("testes");
		return "";
	}
	
}
