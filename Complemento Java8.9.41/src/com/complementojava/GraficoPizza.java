package com.complementojava;

import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class GraficoPizza extends JFrame{

	public GraficoPizza() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Gráfico de Pizza");
		setSize(950,700);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);
	}
	
	public void criarGrafico() {
		
		DefaultPieDataset pizza = new DefaultPieDataset();
		pizza.setValue("Brasil", 5);
		pizza.setValue("Alemanha", 4);
		pizza.setValue("Itália", 4);
		pizza.setValue("Argentina", 2);
		pizza.setValue("Uruguai", 2);
		pizza.setValue("Inglaterra", 1);
		pizza.setValue("Espanha", 1);
		pizza.setValue("França", 1);
		
		JFreeChart grafico = ChartFactory.createPieChart("Campeões Mundiais",pizza,true,true,false);
		
		PiePlot fatia = (PiePlot)grafico.getPlot();
		fatia.setSectionPaint("Brasil",Color.yellow);
		
		ChartPanel painel = new ChartPanel(grafico);
		
		add(painel);
		
	}
	
	public static void main(String[] args) {
		
		new GraficoPizza();
		
	}

}
