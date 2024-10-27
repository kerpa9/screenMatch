package com.kevenreyes.screenmatch.calculus;

public class FilterSuggest {
    private String recomendation;

    public void filter(IClasification clasification){
        if(clasification.getClasification()>=4){
            System.out.println("Esta entre los favoritos");

        }else if(clasification.getClasification()>=2){
            System.out.println("Bien evaluado actualmente");

        }else{
            System.out.println("Colocalo en tu lista para verlo después");

        }

    }
    
}
