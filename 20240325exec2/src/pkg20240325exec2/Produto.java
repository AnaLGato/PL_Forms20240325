/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20240325exec2;

/**
 *
 * @author aluno
 */
public class Produto {

    private String codigo;
    private String descricao;
    private String fornecedor;
    private String qestoque;
    private String valoruni;
    
    public Produto () {}
    
   public void setCodigo(String _codigo) {codigo=_codigo;}
   public void setDescricao(String _descricao) {descricao=_descricao;}
   public void setFornecedor(String _fornecedor) {fornecedor=_fornecedor;}
   public void setQestoque(String _qestoque) {qestoque = _qestoque;}
   public void setValoruni(String _valoruni) {valoruni=_valoruni;}

   public String getCodigo() {return codigo;}
   public String getDescricao() {return descricao;}
   public String getFornecedor() {return fornecedor;}
   public String getQestoque() {return qestoque;}
   public String getValoruni() {return valoruni;} 
    
}
