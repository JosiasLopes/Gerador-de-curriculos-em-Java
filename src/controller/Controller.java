package controller;


/*
 	Este projeto tem a finalidade de gerar um curriculo 
 	baseado em um template simples, usando JAFAFX e a biblioteca Itextpdf
 	criado por: Josias Lopes da Silva
 	
 	Um programa Javafx trabalha através de xml e toda a logica do programa é feita 
 	na classe Controller que deve implementar a interface Initializable e o metodo initialize( onde  alogica acontece)
 	para que o codigo possa se comunicar com os componentes esses devem ter seus ID setados dentro do XML(veja o xml do código)
 	onde devem possuir o mesmo nome dos objetos que serão instanciados no código java
 	todos os componentes visuais que serão usados devem possuir a notação @FXML
 */

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import application.Principal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sun.applet.Main;

public class Controller implements Initializable{

	
	public Pessoa pessoa;
	public Escola escola;
	public ObservableList<Faculdade> listafaculdades = FXCollections.observableArrayList();
	public ObservableList<Curso> listacursos = FXCollections.observableArrayList();
	public ObservableList<Empresa> listaempresas = FXCollections.observableArrayList();
	public ObservableList<String> listaestados = FXCollections.observableArrayList("SP","RJ","ES","MG",
			"BA","SE","PB","PE","PI","RN","DF","CE","TO","MA","PA","AM","MT","MS","RO","RR","AC","AP","RS","SC","PR","AL"
			);
	
	public ObservableList<String> conclusao = FXCollections.observableArrayList("Sim","Não");
	
	public ObservableList<String> ecivil  = FXCollections.observableArrayList("Casado","Solteiro","Divorciado");
	
	@FXML
	public TextField txtNome,txtrua,txtcidade,txtbairro,txtcep,txtidade,txtfone,txtescola,
	txtescolacurso,txtfaculdade,txtcurso,txtcargo,txtempresa,txtcurso2;
	
	@FXML
	public ComboBox comboescolaconcluida,combofaculdadeconcluida,comboestado,ccmbocivil;
	
	@FXML
	public RadioButton radiomedio,radiofundamental,radiosim,radionao;
	
	@FXML
	ToggleGroup grupo1,grupo2;
	
	
	@FXML
	public ListView<Empresa> listaempresa;
	
	@FXML
	public ListView<Curso> listacurso;
	@FXML
	public ListView<Faculdade> listafaculdade;
	
	@FXML
	public Button btnpessoa,addcurso,addfaculdade,cffaculdade,cfcurso,cfexp,addempresa,btngerar;
	
	@FXML 
	DatePicker entrada,saida;
	
	public Controller(){
		txtNome = new TextField("seres");
	}
	
	public void limpafaculdade(){
		this.txtfaculdade.setText("");
		this.txtcurso2.setText("");
	}
	
	public void limpaEscola(){
		this.txtescola.setText("");
	}
	
	public void limpaCurso(){
		this.txtescolacurso.setText("");
		this.txtcurso.setText("");
	}
	public void limpaEmpresa(){
		this.txtempresa.setText("");
		this.txtcargo.setText("");
	}
	
	public void addFaculdades(Faculdade fc){
		this.listafaculdades.add(fc);
	}
	
	@FXML
	public void acao(ActionEvent event) throws Exception{
		
	//	Parent fxmlparent;
	//	URL arqxml;
	//	Node node = (Node)event.getSource();
	//	Stage stage = (Stage) node.getScene().getWindow();
		
	//	arqxml = this.getClass().getResource("tela2.fxml");
	//	fxmlparent = (Parent) FXMLLoader.load(arqxml);
		
		
	//	Scene cena = new Scene(fxmlparent);
	//	stage.setScene(cena);
	//	stage.show();
		
	}
	
	public void controlarOpcoes(){
		if(radiosim.isSelected()==true){
			txtfaculdade.setDisable(false);
			txtcurso2.setDisable(false);
			this.addfaculdade.setDisable(false);
			
			this.combofaculdadeconcluida.setDisable(false);
		}else if(radiosim.isSelected()==false){
			txtfaculdade.setDisable(true);
			txtcurso2.setDisable(true);
			this.addfaculdade.setDisable(true);
		
			this.combofaculdadeconcluida.setDisable(true);
		}
	}
	
	
	
	/*
	 Toda a lógica do javafx acontece dentro da classe controller( que é definida dentro do xml
	 assim como os ids de todoas os componentes também são definidos ainda no xml
	 a logica do prograa é executada dentro do método initialize que faz as chaadas de acordo com os eventos ocorridos
	 nos componentes.
	 */
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	txtNome.setText("jhgjgjhgjgjhg");
	comboescolaconcluida.setItems(conclusao);
	combofaculdadeconcluida.setItems(conclusao);
	comboestado.setItems(listaestados);
	ccmbocivil.setItems(ecivil);
	comboescolaconcluida.getSelectionModel().selectFirst();
	combofaculdadeconcluida.getSelectionModel().selectFirst();
	comboestado.getSelectionModel().selectFirst();
	ccmbocivil.getSelectionModel().selectFirst();
	
	//listafaculdade.setItems(listafaculdades);
	radiomedio.setToggleGroup(grupo1);
	radiofundamental.setToggleGroup(grupo1);
	radiosim.setToggleGroup(grupo2);
	radionao.setToggleGroup(grupo2);
	radiosim.setSelected(true);
	
		
	radiosim.setOnMouseClicked(new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent arg0) {
			radiosim.setSelected(true);
			controlarOpcoes();
		}
		
	});
	
	radionao.setOnMouseClicked(new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent arg0) {
			radionao.setSelected(true);
			controlarOpcoes();
		}
		
	});
	
		btnpessoa.setOnMouseClicked(new EventHandler<MouseEvent>(){
				
			@Override
			public void handle(MouseEvent arg0) {
				
				pessoa = new Pessoa();
				pessoa.setNome(txtNome.getText());
				pessoa.setTelefone(txtfone.getText());
				pessoa.setRua(txtrua.getText());
				pessoa.setBaiiro(txtbairro.getText());
				pessoa.setCidade(txtcidade.getText());
				pessoa.setCep(txtcep.getText());
				pessoa.setEscivil(ccmbocivil.getSelectionModel().getSelectedItem().toString());
				pessoa.setEstado(comboestado.getSelectionModel().getSelectedItem().toString());
				JOptionPane.showMessageDialog(null, "Os dados do candidato "+pessoa.getNome()+" serão adicionados ao currículo");
				
				}
			
			 
		 });
		
		
		addfaculdade.setOnMouseClicked(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent arg0) {
				if(txtfaculdade.getText().equals("") || txtfaculdade.getText().equals(" ") || txtcurso2.getText().equals(" ") || txtcurso2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Os campos Instituição, e Curso na aba Formação Escolar não podem estar vazios!");
				}else{
					listafaculdades.add(new Faculdade(txtfaculdade.getText(),txtcurso2.getText(),combofaculdadeconcluida.getSelectionModel().getSelectedItem().toString()));
					listafaculdade.setItems(listafaculdades);
					limpafaculdade();
					
				}}	 
		 });
		
		cffaculdade.setOnMouseClicked(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent arg0) {
				escola = new Escola();
				if((radionao.isSelected() && (txtescola.getText().equals("") || txtescola.getText().equals(" ")))){
					JOptionPane.showMessageDialog(null, "Os campos Instituição, e Curso na aba Formação Escolar não podem estar vazios!");
				}else if(radionao.isSelected() && (!txtescola.getText().equals("") || !txtescola.getText().equals(" "))){
					escola.setInstituicao(txtescola.getText());
					escola.setConclusao(comboescolaconcluida.getSelectionModel().getSelectedItem().toString());
					limpafaculdade();
					limpaEscola();
					JOptionPane.showMessageDialog(null, escola.getConclusao()+" Instituição: "+escola.getInstituicao());
					
				}else if(radiosim.isSelected()){
						if(txtescola.getText().equals("") || txtescola.getText().equals(" ") || listafaculdade.getItems().size()<=0){
							JOptionPane.showMessageDialog(null, "Os campos Instituição, e Curso na aba Formação Escolar não podem estar vazios!");
						}else{
							escola.setInstituicao(txtescola.getText());
							escola.setConclusao(comboescolaconcluida.getSelectionModel().getSelectedItem().toString());
							//para plotar sera usado um loop para percorrer a lista e adicionala ao pdf
							listafaculdade.getItems().get(0).getInstituicao();
							JOptionPane.showMessageDialog(null, "Escola: "+escola.getInstituicao()+" Faculdade: "+listafaculdade.getItems().get(0).getInstituicao());
						}
					}	 
				}
		 });
		
addcurso.setOnMouseClicked(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent arg0) {
				if(!txtescolacurso.getText().equals("") || !txtescolacurso.getText().equals(" ")){
						if(txtcurso.getText().equals(" ") || txtcurso.getText().equals("")){
								JOptionPane.showMessageDialog(null, "Os campos Instituição, e Curso na aba Cursos Extracurriculares não podem estar vazios!");
						}else{
							
							listacursos.add(new Curso(txtescolacurso.getText(),txtcurso.getText()));
							listacurso.setItems(listacursos);
							limpaCurso();
						}
				}else{
					JOptionPane.showMessageDialog(null, "Os campos Instituição, e Curso na aba Cursos Extracurriculares não podem estar vazios!");
				}}	 
		 });

cfcurso.setOnMouseClicked(new EventHandler<MouseEvent>(){
	
	@Override
	public void handle(MouseEvent arg0) {
		if(listacurso.getItems().size()<=0){
			JOptionPane.showMessageDialog(null, "Não existem cursos para serem adicionados ao curriculo");
		}else{
			listacurso.getItems().get(0).getInstituicao();
			JOptionPane.showMessageDialog(null, "Escola: "+listacurso.getItems().get(0).getInstituicao()+" curso: "+listacurso.getItems().get(0).getCurso());
		}}	 
 });

addempresa.setOnMouseClicked(new EventHandler<MouseEvent>(){

	@Override
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(txtempresa.getText().equals("") || txtempresa.getText().equals(" ") || txtcargo.getText().equals("") || txtcargo.getText().equals(" ")){
			JOptionPane.showMessageDialog(null, "Os campos Empresa, e Cargo na aba Cursos Extracurriculares não podem estar vazios!");
		
	}else{
		Calendar c = Calendar.getInstance();
		c.set(entrada.getValue().getYear(),entrada.getValue().getMonthValue()-1,entrada.getValue().getDayOfMonth());
		Calendar d = Calendar.getInstance();
		d.set(saida.getValue().getYear(),saida.getValue().getMonthValue()-1,saida.getValue().getDayOfMonth());
		Date entra = c.getTime();
		Date sai = d.getTime();
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		
		listaempresas.add(new Empresa(txtempresa.getText(),txtcargo.getText(),entra,sai));
		listaempresa.setItems(listaempresas);
		limpaEmpresa();
		
		
	}
		
	}
	
});

cfexp.setOnMouseClicked(new EventHandler<MouseEvent>(){

	@Override
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(listaempresa.getItems().size()<=0){
			JOptionPane.showMessageDialog(null, "Não existem experiencias para serem adicionados ao curriculo");
		}else{
			listaempresa.getItems().get(0).getEmpresa();
			JOptionPane.showMessageDialog(null, "Empresa: "+listaempresa.getItems().get(0).getEmpresa()+" cargo: "+listaempresa.getItems().get(0).getCargo()+
					"Data de inicio: "+listaempresa.getItems().get(0).getEntrada()+"Data final: "+listaempresa.getItems().get(0).getSaida());
		}	
		
	}
	
});

btngerar.setOnMouseClicked(new EventHandler<MouseEvent>(){

	@Override
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		}
	
	
});

btngerar.setOnMouseClicked(new EventHandler<MouseEvent>(){

	@Override
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(pessoa!=null){
		Document document = new Document();
		document.setMargins(20, 20, 40, 20);
		Font fonteTabelas = new Font(Font.FontFamily.UNDEFINED, 14.1f, Font.BOLD);
		Font fontegeral = new Font(Font.FontFamily.UNDEFINED, 13.1f, Font.NORMAL);
		try {
			
			//Primeiro o arquivo deve ser criado para que so então o Itext possa acessalo atraves de metodo open
			//todo o processo de formatacão é feito com o arquivo ainda aberto e após
			//o processo termnar o arquivo deve ser fechado.
			 SalvarArquivo salvar = new SalvarArquivo();
		        String arquivo = salvar.pasta();
			//File arquivo = new File("d:\\arquivo.pdf");
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(arquivo));

            document.open();
			
			Paragraph p = new Paragraph("Curriculo", fonteTabelas);
			p.setSpacingAfter(15);
			Paragraph infopessoais = new Paragraph("Informações pessoais", fonteTabelas);
			infopessoais.setIndentationLeft(70);
			infopessoais.setSpacingAfter(4);
			Paragraph pnome = new Paragraph("Nome: "+pessoa.getNome()+"\n"+"Estado civil: "+pessoa.getEscivil(),fontegeral);
			pnome.setIndentationLeft(70);
			Paragraph pendereco = new Paragraph("Rua: "+pessoa.getRua()+", "+pessoa.getBaiiro()+", "+pessoa.getCidade()+", "+pessoa.getEstado()+", cep: "+pessoa.getCep(),fontegeral);
			pnome.setIndentationLeft(70);
			pendereco.setIndentationLeft(70);
			Paragraph fone = new Paragraph("Telefone: "+pessoa.getTelefone(),fontegeral);
			fone.setIndentationLeft(70);
			p.setAlignment(Element.ALIGN_CENTER);
			p.setIndentationLeft(-18);
			Paragraph formacao = new Paragraph("Formação e escolaridade", fonteTabelas);
			formacao.setIndentationLeft(70);
			formacao.setSpacingAfter(7);
			formacao.setSpacingBefore(7);
			document.add(p);
			document.add(infopessoais);
			document.add(pnome);
			document.add(pendereco);
			document.add(fone);
			document.add(formacao);
			String texto = null;
			
			if(comboescolaconcluida.getSelectionModel().getSelectedItem().toString().equals("Sim")){
				if(radiomedio.isSelected()){
					texto = "Ensino medio completo";
				}else{
					texto = "Ensino fundamental completo";
				}
			}else{
				if(radiofundamental.isSelected()){
					texto = "Ensino medio incompleto";
				}else{
					texto = "Ensino fundamental incompleto";
				}
			}
			Paragraph instituicao = new Paragraph("Instituição: "+txtescola.getText(),fontegeral);
			Paragraph concluuido = new Paragraph("Situação: "+texto,fontegeral);
			concluuido.setSpacingAfter(3);
			instituicao.setIndentationLeft(70);
			concluuido.setIndentationLeft(70);
			document.add(instituicao);
			document.add(concluuido);
			if(radiosim.isSelected()){
				//List<Element> el = new ArrayList<Element>();
				for(int i = 0;i<listafaculdade.getItems().size();i++){
					String faculdade = listafaculdade.getItems().get(i).getInstituicao();
					String curso = listafaculdade.getItems().get(i).getCurso();
					String concluido = listafaculdade.getItems().get(i).getConclusao();
					Paragraph ps = new Paragraph();
					ps.setIndentationLeft(70);
					ps.add("Instituição: "+faculdade+"\n"+"Curso: "+curso+" concluido: "+concluido);
					ps.setFont(fontegeral);
					document.add(ps);
				}
			}
			Paragraph cursos = new Paragraph("Cursos extracurriculares",fonteTabelas);
			cursos.setSpacingAfter(7);
			cursos.setSpacingBefore(7);
			cursos.setIndentationLeft(70);
			document.add(cursos);
			for(int i = 0;i<listacurso.getItems().size();i++){
				String escola = listacurso.getItems().get(i).getInstituicao();
				String curso = listacurso.getItems().get(i).getCurso();
				
				Paragraph ps = new Paragraph();
				ps.setIndentationLeft(70);
				ps.add(curso+" - "+escola);
				ps.setFont(fontegeral);
				document.add(ps);
			}
			
			Paragraph exper = new Paragraph("Experiências profissionais",fonteTabelas);
			exper.setSpacingAfter(7);
			exper.setSpacingBefore(7);
			exper.setIndentationLeft(70);
			document.add(exper);
			SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
			for(int i = 0;i<listaempresa.getItems().size();i++){
				String empresa = listaempresa.getItems().get(i).getEmpresa();
				String cargo = listaempresa.getItems().get(i).getCargo();
				String dataentrada = sp.format(listaempresa.getItems().get(i).getEntrada());
				String datasaida = sp.format(listaempresa.getItems().get(i).getSaida());
				
				Paragraph ps = new Paragraph();
				ps.setSpacingBefore(2.5f);
				ps.setIndentationLeft(70);
				ps.setFont(fontegeral);
				
				ps.add("Empresa: "+empresa+"\n"+"Cargo: "+cargo+"\n"+"Data inicial: "+dataentrada+"\n"+"Data final: "+datasaida);
				document.add(ps);
			}
			
			if (!arquivo.equals("")) {
                Desktop.getDesktop().open(new File(arquivo));
            }
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally{
			document.close();
		}
		
	}else{
		JOptionPane.showMessageDialog(null, "O curriculo deve ter um candidato especificado preencha a seção informações pessoais");
	}
	
}
	
	});
}
}


