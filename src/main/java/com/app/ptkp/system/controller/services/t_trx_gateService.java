package com.app.ptkp.system.controller.services;

import java.util.List;

import com.app.ptkp.system.controller.model.t_trx_gate;

public interface t_trx_gateService {
	List findAllData();
	t_trx_gate saveData(t_trx_gate gate);
	t_trx_gate updateData(t_trx_gate gate);
	t_trx_gate deleteData(t_trx_gate gate);
}
