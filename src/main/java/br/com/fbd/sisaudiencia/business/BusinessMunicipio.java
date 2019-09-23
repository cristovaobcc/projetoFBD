/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.dao.DaoMunicipio;
import br.com.fbd.sisaudiencia.dao.IDaoMunicipio;
import br.com.fbd.sisaudiencia.model.Municipio;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class BusinessMunicipio implements IBusinessMunicipio{
    private IDaoMunicipio iDaoMunicipio;
    
    public BusinessMunicipio(){
        iDaoMunicipio = new DaoMunicipio();
    }

    @Override
    public boolean carregarMunicipios() {
        return iDaoMunicipio.carregarMunicipios();
    }

    @Override
    public Municipio getMunicipio(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipio> getAll(Integer idEstado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
