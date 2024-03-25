/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20240325;

/**
 *
 * @author aluno
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    private String ra;
    private String nome;
    private String sexo;
    private String datanascimento;
    private String telefone;
    
    public Aluno () {}
   public void setRA(String _ra) {ra=_ra;}
   public void setNome(String _nome) {nome=_nome;}
   public void setSexo(String _sexo) {sexo=_sexo;}
   public void setDataNascimento(String _datanascimento) {datanascimento = _datanascimento;}
   public void setTelefone(String _telefone) {telefone=_telefone;}

   public String getRA() {return ra;}
   public String getNome() {return nome;}
   public String getSexo() {return sexo;}
   public String getDataNascimento() {return datanascimento;}
   public String getTelefone() {return telefone;} 
    
    
    
}
