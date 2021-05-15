/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Dr. Bala
 */
@ManagedBean(name="p", eager=true)
@RequestScoped
public class Prime {
private String date;
private PieChartModel pieModel;  
    /**
     * Creates a new instance of Prime
     */
    public Prime() {
        createPieModel();
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private void createPieModel() {  
        pieModel = new PieChartModel();  
        pieModel.set("IT", 100);  
        pieModel.set("SE", 300);  
        pieModel.set("CS", 200);  
        pieModel.setTitle("People");  
        pieModel.setLegendPosition("Number");  
}  

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
    
}
