package progra3lab;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_usuariop database table.
 * 
 */
@Entity
@Table(name="tb_usuariop")
@NamedQuery(name="TbUsuariop.findAll", query="SELECT t FROM TbUsuariop t")
public class TbUsuariop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuarios;

	private String usuario;
	private String contrasenia;




	//bi-directional many-to-one association to TbHistorial
	@OneToMany(mappedBy="tbUsuariop")
	private List<TbHistorial> tbHistorials;

	public TbUsuariop() {
	}

	public int getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<TbHistorial> getTbHistorials() {
		return this.tbHistorials;
	}

	public void setTbHistorials(List<TbHistorial> tbHistorials) {
		this.tbHistorials = tbHistorials;
	}

	public TbHistorial addTbHistorial(TbHistorial tbHistorial) {
		getTbHistorials().add(tbHistorial);
		tbHistorial.setTbUsuariop(this);

		return tbHistorial;
	}

	public TbHistorial removeTbHistorial(TbHistorial tbHistorial) {
		getTbHistorials().remove(tbHistorial);
		tbHistorial.setTbUsuariop(null);

		return tbHistorial;
	}

	@Override
	public String toString() {
		return "TbUsuariop [idUsuarios=" + idUsuarios +", contrasenia="
				+ contrasenia + ", usuario=" + usuario
				+ ", tbHistorials=" + tbHistorials + "]";
	}

}