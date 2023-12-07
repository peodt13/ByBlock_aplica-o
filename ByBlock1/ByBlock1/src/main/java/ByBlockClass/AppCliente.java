
package ByBlockClass;

import java.util.ArrayList;


public class AppCliente {
    private ArrayList<ClassCliente> Listacliente = new ArrayList();
    
    public ArrayList <ClassCliente> getListaClientes(){
        return Listacliente;
    }
    
    public void setlistacliente (ArrayList<ClassCliente> listacliente){
        this.Listacliente = listacliente;
    }
    
    public void insereCliente (ClassCliente p){
        Listacliente.add(p);
    }
    
    public String Listarcliente(){
        String saida = " ";
        if (Listacliente.isEmpty()){
            saida = "Nenhuma marca cadastrada";
        }else {
            for(ClassCliente p:Listacliente){
                saida = saida + p.status()+"\n";
            }
        }
        return saida;
    }
    
    
}
