package br.com.verbososcorp.ilocation.services.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.verbososcorp.ilocation.models.GeoLocation;
import br.com.verbososcorp.ilocation.models.Order;

public interface OrderService {
	
	public ResponseEntity<List<Order>> getAll();
	
	public ResponseEntity<Order> getByID(Integer id);
	
	public ResponseEntity<List<GeoLocation>> getTracking(Integer id);
	
	public ResponseEntity<List<Order>> getByStatus(Integer status);
	
	public ResponseEntity<?> assignDeliveryPerson(Integer idOrder, Integer idDeliveryPerson);

}
