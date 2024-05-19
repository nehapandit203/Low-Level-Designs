package com.example.demo.creational.prototype;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotebookModel implements Prototype<NotebookModel> {

    private int noOfPages;
    private int length;
    private int breadth;
    private int price;
    private String fact;
    private String coverType;


    @Override
    public NotebookModel clone() {
        NotebookModel registerModel = new NotebookModel();

        registerModel.breadth=this.breadth;
        registerModel.coverType=this.coverType;
        registerModel.fact=this.fact;
        registerModel.length=this.length;
        registerModel.noOfPages=this.noOfPages;
        registerModel.price=this.price;
        return registerModel;
    }


}
