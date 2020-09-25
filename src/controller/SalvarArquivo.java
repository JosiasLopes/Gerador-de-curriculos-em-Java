package controller;

/*
	Este projeto tem a finalidade de gerar um curriculo 
	baseado em um template simples, usando JAFAFX e a biblioteca Itextpdf
	criado por: Josias Lopes da Silva
	
	A classe SalvarArquivo tem o objetivo de salvar um arquivo pdf para uso com o Itext
	basicamente a classe retorna uma String com o caminho do arquivo para que seja salvo
*/

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class SalvarArquivo {

    public String pasta() {
        String pasta = ""; 
        
        //cria um objeto da classe JFileChoser
        JFileChooser jfile = new JFileChooser();

        //SETAR PARA ADICIONAR APENAS ARQUIVOS
        jfile.setFileSelectionMode(JFileChooser.FILES_ONLY);

        //DESABILITAR TODOS OS TIPOS DE ARQUIVOS
        jfile.setAcceptAllFileFilterUsed(false);

        //FILTRAR POR EXTRENSAO
        jfile.setFileFilter(new FileFilter() {
            @Override
            public String getDescription() {
                return ".pdf";
            }

            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".pdf");
            }
        });

        //MOSTRAR JANELA PARA SALVAR
        int acao = jfile.showSaveDialog(null);

        //EXECUTAR AÇÃO
        
        if (acao == JFileChooser.APPROVE_OPTION) {
            pasta = jfile.getSelectedFile().getAbsolutePath() + ".pdf";            
        }
        if (acao == JFileChooser.CANCEL_OPTION) { 
            
        }
        if (acao == JFileChooser.ERROR_OPTION) {
            //outra opcao           
        }
        return pasta;
    }
}
