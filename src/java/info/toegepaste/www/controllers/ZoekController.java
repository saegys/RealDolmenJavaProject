package info.toegepaste.www.controllers;

import info.toegepaste.www.models.Gemeente;
import info.toegepaste.www.models.Reis;
import info.toegepaste.www.services.GemeenteService;
import info.toegepaste.www.services.ReisService;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Bruno
 */
@Named
@RequestScoped
public class ZoekController implements Serializable{
    @Inject
    private ZoekController zoekController;
    @Inject
    private GemeenteService gemeenteService;
    @Inject
    private ReisService reisService;
    private Gemeente gemeente;
    private List<Gemeente> bestemmingen;

    public ReisService getReisService() {
        return reisService;
    }

    public void setReisService(ReisService reisService) {
        this.reisService = reisService;
    }

    public Gemeente getGemeente() {
        return gemeente;
    }

    public void setGemeente(Gemeente gemeente) {
        this.gemeente = gemeente;
    }

    public List<Gemeente> getBestemmingen() {
        return bestemmingen;
    }

    public void setBestemmingen(List<Gemeente> bestemmingen) {
        this.bestemmingen = bestemmingen;
    }

    public ZoekController getZoekController() {
        return zoekController;
    }

    public void setZoekController(ZoekController zoekController) {
        this.zoekController = zoekController;
    }

    public GemeenteService getGemeenteService() {
        return gemeenteService;
    }

    public void setGemeenteService(GemeenteService gemeenteService) {
        this.gemeenteService = gemeenteService;
    }
    
    public List<Gemeente> getAlleBestemmingen() {
        return gemeenteService.getAllBestemmingen();
    }
    
    public List<Reis> getReisByBestemming() {
        return reisService.getReisByGemeente(gemeente);
    }
}