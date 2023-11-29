/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.pgy2121.model.dao;
import java.util.List;

/**
 *
 * @author Plaza Vespucio
 */
public interface IGenericDAO {
    
    public int insert(Object object);
    public int update(Object object);
    public int delete(Object object);
    public List<?> selectAll();
}
