
package ByBlockClass;

public class ClassCliente {
    private String marca, cnpj, produto, celular, email;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String status (){
        return "Marca: "+this.marca+
               "\nCNPJ : "+this.cnpj+
                "\nProduto  : "+this.produto+
                "\nCelular : "+this.celular+
                "\nEmail : "+this.email;
                
               
    }
    
    
}
