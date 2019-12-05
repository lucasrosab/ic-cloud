package com.ic.cloud;

public class Cromossomo {
	
	private Integer idCromossomo;
	private String nomeVM;
	private Double custoInvestidoVM;
	private Double custoMensalVM;
	private Double capacidadeMemVM;
	private Integer qtdNucleosVM;
	private Integer lmtMaquinaVM;
	private Double  custoUpload;
	private Double tempoMedioExecVm;
	private Double custoDownload;
	private String software;
	private Integer capacidadeArmazenamento;
	private String nomeMaquinaUsr;
	private Integer capacidadeMemUsr;
	private Integer qtdNucleosUsr;
	private Double tempoMedioExecUsr;
	
	public Cromossomo(Integer idCromossomo, String nomeVM, Double custoInvestidoVM, Double custoMensalVM,
			Double capacidadeMemVM, Integer qtdNucleosVM, Integer lmtMaquinaVM, Double custoUpload,
			Double tempoMedioExecVm, Double custoDownload, String software, Integer capacidadeArmazenamento,
			String nomeMaquinaUsr, Integer capacidadeMemUsr, Integer qtdNucleosUsr, Double tempoMedioExecUsr) {
		super();
		this.idCromossomo = idCromossomo;
		this.nomeVM = nomeVM;
		this.custoInvestidoVM = custoInvestidoVM;
		this.custoMensalVM = custoMensalVM;
		this.capacidadeMemVM = capacidadeMemVM;
		this.qtdNucleosVM = qtdNucleosVM;
		this.lmtMaquinaVM = lmtMaquinaVM;
		this.custoUpload = custoUpload;
		this.tempoMedioExecVm = tempoMedioExecVm;
		this.custoDownload = custoDownload;
		this.software = software;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
		this.nomeMaquinaUsr = nomeMaquinaUsr;
		this.capacidadeMemUsr = capacidadeMemUsr;
		this.qtdNucleosUsr = qtdNucleosUsr;
		this.tempoMedioExecUsr = tempoMedioExecUsr;
	}

	public Integer getIdCromossomo() {
		return idCromossomo;
	}

	public void setIdCromossomo(Integer idCromossomo) {
		this.idCromossomo = idCromossomo;
	}

	public String getNomeVM() {
		return nomeVM;
	}

	public void setNomeVM(String nomeVM) {
		this.nomeVM = nomeVM;
	}

	public Double getCustoInvestidoVM() {
		return custoInvestidoVM;
	}

	public void setCustoInvestidoVM(Double custoInvestidoVM) {
		this.custoInvestidoVM = custoInvestidoVM;
	}

	public Double getCustoMensalVM() {
		return custoMensalVM;
	}

	public void setCustoMensalVM(Double custoMensalVM) {
		this.custoMensalVM = custoMensalVM;
	}

	public Double getCapacidadeMemVM() {
		return capacidadeMemVM;
	}

	public void setCapacidadeMemVM(Double capacidadeMemVM) {
		this.capacidadeMemVM = capacidadeMemVM;
	}

	public Integer getQtdNucleosVM() {
		return qtdNucleosVM;
	}

	public void setQtdNucleosVM(Integer qtdNucleosVM) {
		this.qtdNucleosVM = qtdNucleosVM;
	}

	public Integer getLmtMaquinaVM() {
		return lmtMaquinaVM;
	}

	public void setLmtMaquinaVM(Integer lmtMaquinaVM) {
		this.lmtMaquinaVM = lmtMaquinaVM;
	}

	public Double getCustoUpload() {
		return custoUpload;
	}

	public void setCustoUpload(Double custoUpload) {
		this.custoUpload = custoUpload;
	}

	public Double getTempoMedioExecVm() {
		return tempoMedioExecVm;
	}

	public void setTempoMedioExecVm(Double tempoMedioExecVm) {
		this.tempoMedioExecVm = tempoMedioExecVm;
	}

	public Double getCustoDownload() {
		return custoDownload;
	}

	public void setCustoDownload(Double custoDownload) {
		this.custoDownload = custoDownload;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public Integer getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}

	public void setCapacidadeArmazenamento(Integer capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}

	public String getNomeMaquinaUsr() {
		return nomeMaquinaUsr;
	}

	public void setNomeMaquinaUsr(String nomeMaquinaUsr) {
		this.nomeMaquinaUsr = nomeMaquinaUsr;
	}

	public Integer getCapacidadeMemUsr() {
		return capacidadeMemUsr;
	}

	public void setCapacidadeMemUsr(Integer capacidadeMemUsr) {
		this.capacidadeMemUsr = capacidadeMemUsr;
	}

	public Integer getQtdNucleosUsr() {
		return qtdNucleosUsr;
	}

	public void setQtdNucleosUsr(Integer qtdNucleosUsr) {
		this.qtdNucleosUsr = qtdNucleosUsr;
	}

	public Double getTempoMedioExecUsr() {
		return tempoMedioExecUsr;
	}

	public void setTempoMedioExecUsr(Double tempoMedioExecUsr) {
		this.tempoMedioExecUsr = tempoMedioExecUsr;
	}

}
