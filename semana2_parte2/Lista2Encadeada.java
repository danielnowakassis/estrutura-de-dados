package minha_le;

import jdk.swing.interop.SwingInterOpUtils;
import listaencadeada.NoAD;

import java.util.Objects;


public class Lista2Encadeada {
    private No primeiro;
    private No ultimo;
    public Lista2Encadeada(){
        this.primeiro = null;
        this.ultimo = null;
    }
    public Lista2Encadeada(No pPrimeiro){
        this.primeiro = pPrimeiro;
        this.ultimo = pPrimeiro;
    }
    public boolean vazia(){
        return this.primeiro == null && this.ultimo == null;
    }

    public No encontra(int pDado){
        if(this.vazia()){
            System.out.println("Lista vazia");
            return null;
        }else if(this.primeiro != null){
            No encontra = this.primeiro;
            boolean found = false;
            while(encontra.getProximo() != null){
                encontra = encontra.getProximo();
                if(encontra.getDado() == pDado){
                    return encontra;
                }
                found = true;
            }
            if (!found)return null;
        }else if(this.ultimo != null){
            No encontra = this.ultimo;
            boolean found = false;
            while(encontra.getAnterior() != null){
                encontra = encontra.getAnterior();
                if(encontra.getDado() == pDado){
                    return encontra;
                }
            }
            return null;
        }

        return null;
    }
    public void imprimirInicio2Fim(){
        if(!this.vazia()){
        No imprime = this.primeiro;
        System.out.println(imprime.getDado());
        while(imprime.getProximo() != null){
            imprime = imprime.getProximo();
            System.out.println(imprime.getDado());
        }
        }
    }

    public void imprimirFim2Inicio(){
        if(!this.vazia()){
            No imprime = this.ultimo;
            System.out.println(imprime.getDado());
            while(imprime.getAnterior() != null){
                imprime = imprime.getAnterior();
                System.out.println(imprime.getDado());
            }
        }
    }

    public void inserePrimeiro(int pDado){
        if(this.primeiro == null) {
            No primeiro = new No(pDado);
            this.primeiro = primeiro;
            if(this.ultimo != null){
                No ant_primeiro = this.ultimo;
                this.primeiro.setProximo(ant_primeiro);
                while(ant_primeiro.getAnterior() != null){
                    ant_primeiro = ant_primeiro.getAnterior();
                }
                this.primeiro.setProximo(ant_primeiro);
            }else{
                this.ultimo = primeiro;
            }
        }
        else{
            No novo_primeiro = new No(pDado);
            novo_primeiro.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo_primeiro);
            this.primeiro = novo_primeiro;
        }
    }
    public void insereUltimo(int pDado){
        if(this.ultimo == null){
            No ultimo = new No(pDado);
            this.ultimo = ultimo;
            if(this.primeiro != null){
                No prox_primeiro = this.primeiro;
                this.ultimo.setAnterior(prox_primeiro);
                while(prox_primeiro.getProximo() != null){
                    prox_primeiro = prox_primeiro.getProximo();
                }
                this.ultimo.setAnterior(prox_primeiro);
            }else{
                this.primeiro = this.ultimo;
            }
        }else{
            No novo_ultimo = new No(pDado);
            novo_ultimo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novo_ultimo);
            this.ultimo = novo_ultimo;
        }
    }

    public void removePrimeiro(){
        if(this.vazia()){
            System.out.println("A lista está vazia");
        }else if(this.primeiro == null && this.ultimo != null){
            No encontra_primeiro = this.ultimo.getAnterior();
            while(encontra_primeiro.getAnterior() != null){
                encontra_primeiro = encontra_primeiro.getAnterior();
            }
            encontra_primeiro.getProximo().setAnterior(null);
        }else if(this.primeiro != null){
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
    }

    public void removeUltimo(){
        if(this.vazia()){
            System.out.println("A lista está vazia");
        }else if(this.ultimo == null && this.primeiro != null){
            No encontra_ultimo = this.primeiro.getProximo();
            while(encontra_ultimo.getProximo() != null){
                encontra_ultimo = encontra_ultimo.getProximo();
            }
            encontra_ultimo.getAnterior().setProximo(null);
        }
        else if(this.ultimo != null){
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
    }

    public No insereDepois(No  pNo,  int  pDado){
        if(this.vazia()){
            System.out.println("Lista vazia");
            return null;
        }else if(this.primeiro != null){
            No encontra = this.primeiro;
            while(encontra.getProximo() != null){
                encontra = encontra.getProximo();
                if(Objects.equals(encontra.getDado(), pNo.getDado())){
                    No insert = new No(pDado);
                    insert.setAnterior(encontra);
                    insert.setProximo(encontra.getProximo());
                    encontra.getProximo().setAnterior(insert);
                    encontra.setProximo(insert);
                }
            }
            return null;
        }else if(this.ultimo != null){
            No encontra = this.ultimo;
            boolean found = false;
            while(encontra.getAnterior() != null){
                encontra = encontra.getAnterior();
                if(Objects.equals(encontra.getDado(), pNo.getDado())){
                    No insert = new No(pDado);
                    insert.setAnterior(encontra);
                    insert.setProximo(encontra.getProximo());
                    encontra.getProximo().setAnterior(insert);
                    encontra.setProximo(insert);
                }
            }
            return null;
        }

        return null;
    }
    public No remove(No pNo){
        if(this.vazia()){
            System.out.println("Lista vazia");
            return null;
        }else if(this.primeiro != null){
            No encontra = this.primeiro;
            while(encontra.getProximo() != null){
                encontra = encontra.getProximo();
                if(Objects.equals(encontra.getDado(), pNo.getDado())){
                    encontra.getAnterior().setProximo(encontra.getProximo());
                    encontra.getProximo().setAnterior(encontra.getAnterior());
                }
            }
            return null;
        }else if(this.ultimo != null){
            No encontra = this.ultimo;
            boolean found = false;
            while(encontra.getAnterior() != null){
                encontra = encontra.getAnterior();
                if(Objects.equals(encontra.getDado(), pNo.getDado())){
                    encontra.getAnterior().setProximo(encontra.getProximo());
                    encontra.getProximo().setAnterior(encontra.getAnterior());
                    return encontra;
                }
            }
           return null;
        }

        return null;
    }

}
