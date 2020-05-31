package com.mkyong.stock.dao;

import com.mkyong.stock.model.Stock;

public interface StockDao {

	public void save(Stock stock);
	public void update(Stock stock);
	public void delete(Stock stock);
	public Stock findByStockCode(String stockCode);
}
