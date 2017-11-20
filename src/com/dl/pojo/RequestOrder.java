package com.dl.pojo;

public class RequestOrder {
	
	private String clientID;
	private String logisticProviderID;
	private String customsID;
	private String dataType;
	private String logisticsCode;
	private String logisticsName;
	private String logisticsCodeCiq;
	private String logisticsNameCiq;
	private String totalLogisticsNo;
	private String subLogisticsNo;
	private String logisticsNo;
	private String orderNo;
	private String platformCode;
	private String platformName;
	private String platformCodeCiq;
	private String platformNameCiq;
	private String trackNo;
	private String trackStatus;
	private String shipping;
	private String shippingAddress;
	private String shippingTelephone;
	private String shippingZipCode;
	private String shippingCountryCiq;
	private String shippingCountryCus;
	private String consignee;
	private String consigneeAddress;
	private String consigneeTelephone;
	private String consigneeZipCode;
	private String consigneeCountryCiq;
	private String consigneeCountryCus;
	private String idType;
	private String idNumber;
	private String declarationDate;
	private String internationalFreight;
	private String domesticFreight;
	private String supportValue;
	private String worth;
	private String currCode;
	private String grossWeight;
	private String quantity;
	private String packageTypeCiq;
	private String packageTypeCus;
	private String packNum;
	private String netWeight;
	private String goodsName;
	private String deliveryMethod;
	private String transportationMethod;
	private String shipCode;
	private String shipName;
	private String destinationPort;
	private String ieType;
	private String stockFlag;
	private String batchNumbers;
	private String tradeCountryCiq;
	private String tradeCountryCus;
	private String agentCode;
	private String agentName;
	private String agentCodeCiq;
	private String agentNameCiq;
	private String billType;
	private String modifyMark;
	private String customsField;
	private String note;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	private String reserve4;
	private String reserve5;
	@Override
	public String toString() {
		return "RequestOrder [clientID=" + clientID + ", logisticProviderID=" + logisticProviderID + ", customsID="
				+ customsID + ", dataType=" + dataType + ", logisticsCode=" + logisticsCode + ", logisticsName="
				+ logisticsName + ", logisticsCodeCiq=" + logisticsCodeCiq + ", logisticsNameCiq=" + logisticsNameCiq
				+ ", totalLogisticsNo=" + totalLogisticsNo + ", subLogisticsNo=" + subLogisticsNo + ", logisticsNo="
				+ logisticsNo + ", orderNo=" + orderNo + ", platformCode=" + platformCode + ", platformName="
				+ platformName + ", platformCodeCiq=" + platformCodeCiq + ", platformNameCiq=" + platformNameCiq
				+ ", trackNo=" + trackNo + ", trackStatus=" + trackStatus + ", shipping=" + shipping
				+ ", shippingAddress=" + shippingAddress + ", shippingTelephone=" + shippingTelephone
				+ ", shippingZipCode=" + shippingZipCode + ", shippingCountryCiq=" + shippingCountryCiq
				+ ", shippingCountryCus=" + shippingCountryCus + ", consignee=" + consignee + ", consigneeAddress="
				+ consigneeAddress + ", consigneeTelephone=" + consigneeTelephone + ", consigneeZipCode="
				+ consigneeZipCode + ", consigneeCountryCiq=" + consigneeCountryCiq + ", consigneeCountryCus="
				+ consigneeCountryCus + ", idType=" + idType + ", idNumber=" + idNumber + ", declarationDate="
				+ declarationDate + ", internationalFreight=" + internationalFreight + ", domesticFreight="
				+ domesticFreight + ", supportValue=" + supportValue + ", worth=" + worth + ", currCode=" + currCode
				+ ", grossWeight=" + grossWeight + ", quantity=" + quantity + ", packageTypeCiq=" + packageTypeCiq
				+ ", packageTypeCus=" + packageTypeCus + ", packNum=" + packNum + ", netWeight=" + netWeight
				+ ", goodsName=" + goodsName + ", deliveryMethod=" + deliveryMethod + ", transportationMethod="
				+ transportationMethod + ", shipCode=" + shipCode + ", shipName=" + shipName + ", destinationPort="
				+ destinationPort + ", ieType=" + ieType + ", stockFlag=" + stockFlag + ", batchNumbers=" + batchNumbers
				+ ", tradeCountryCiq=" + tradeCountryCiq + ", tradeCountryCus=" + tradeCountryCus + ", agentCode="
				+ agentCode + ", agentName=" + agentName + ", agentCodeCiq=" + agentCodeCiq + ", agentNameCiq="
				+ agentNameCiq + ", billType=" + billType + ", modifyMark=" + modifyMark + ", customsField="
				+ customsField + ", note=" + note + ", reserve1=" + reserve1 + ", reserve2=" + reserve2 + ", reserve3="
				+ reserve3 + ", reserve4=" + reserve4 + ", reserve5=" + reserve5 + "]";
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getLogisticProviderID() {
		return logisticProviderID;
	}
	public void setLogisticProviderID(String logisticProviderID) {
		this.logisticProviderID = logisticProviderID;
	}
	public String getCustomsID() {
		return customsID;
	}
	public void setCustomsID(String customsID) {
		this.customsID = customsID;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getLogisticsCode() {
		return logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}
	public String getLogisticsName() {
		return logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}
	public String getLogisticsCodeCiq() {
		return logisticsCodeCiq;
	}
	public void setLogisticsCodeCiq(String logisticsCodeCiq) {
		this.logisticsCodeCiq = logisticsCodeCiq;
	}
	public String getLogisticsNameCiq() {
		return logisticsNameCiq;
	}
	public void setLogisticsNameCiq(String logisticsNameCiq) {
		this.logisticsNameCiq = logisticsNameCiq;
	}
	public String getTotalLogisticsNo() {
		return totalLogisticsNo;
	}
	public void setTotalLogisticsNo(String totalLogisticsNo) {
		this.totalLogisticsNo = totalLogisticsNo;
	}
	public String getSubLogisticsNo() {
		return subLogisticsNo;
	}
	public void setSubLogisticsNo(String subLogisticsNo) {
		this.subLogisticsNo = subLogisticsNo;
	}
	public String getLogisticsNo() {
		return logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPlatformCode() {
		return platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public String getPlatformCodeCiq() {
		return platformCodeCiq;
	}
	public void setPlatformCodeCiq(String platformCodeCiq) {
		this.platformCodeCiq = platformCodeCiq;
	}
	public String getPlatformNameCiq() {
		return platformNameCiq;
	}
	public void setPlatformNameCiq(String platformNameCiq) {
		this.platformNameCiq = platformNameCiq;
	}
	public String getTrackNo() {
		return trackNo;
	}
	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}
	public String getTrackStatus() {
		return trackStatus;
	}
	public void setTrackStatus(String trackStatus) {
		this.trackStatus = trackStatus;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getShippingTelephone() {
		return shippingTelephone;
	}
	public void setShippingTelephone(String shippingTelephone) {
		this.shippingTelephone = shippingTelephone;
	}
	public String getShippingZipCode() {
		return shippingZipCode;
	}
	public void setShippingZipCode(String shippingZipCode) {
		this.shippingZipCode = shippingZipCode;
	}
	public String getShippingCountryCiq() {
		return shippingCountryCiq;
	}
	public void setShippingCountryCiq(String shippingCountryCiq) {
		this.shippingCountryCiq = shippingCountryCiq;
	}
	public String getShippingCountryCus() {
		return shippingCountryCus;
	}
	public void setShippingCountryCus(String shippingCountryCus) {
		this.shippingCountryCus = shippingCountryCus;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getConsigneeAddress() {
		return consigneeAddress;
	}
	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}
	public String getConsigneeTelephone() {
		return consigneeTelephone;
	}
	public void setConsigneeTelephone(String consigneeTelephone) {
		this.consigneeTelephone = consigneeTelephone;
	}
	public String getConsigneeZipCode() {
		return consigneeZipCode;
	}
	public void setConsigneeZipCode(String consigneeZipCode) {
		this.consigneeZipCode = consigneeZipCode;
	}
	public String getConsigneeCountryCiq() {
		return consigneeCountryCiq;
	}
	public void setConsigneeCountryCiq(String consigneeCountryCiq) {
		this.consigneeCountryCiq = consigneeCountryCiq;
	}
	public String getConsigneeCountryCus() {
		return consigneeCountryCus;
	}
	public void setConsigneeCountryCus(String consigneeCountryCus) {
		this.consigneeCountryCus = consigneeCountryCus;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getDeclarationDate() {
		return declarationDate;
	}
	public void setDeclarationDate(String declarationDate) {
		this.declarationDate = declarationDate;
	}
	public String getInternationalFreight() {
		return internationalFreight;
	}
	public void setInternationalFreight(String internationalFreight) {
		this.internationalFreight = internationalFreight;
	}
	public String getDomesticFreight() {
		return domesticFreight;
	}
	public void setDomesticFreight(String domesticFreight) {
		this.domesticFreight = domesticFreight;
	}
	public String getSupportValue() {
		return supportValue;
	}
	public void setSupportValue(String supportValue) {
		this.supportValue = supportValue;
	}
	public String getWorth() {
		return worth;
	}
	public void setWorth(String worth) {
		this.worth = worth;
	}
	public String getCurrCode() {
		return currCode;
	}
	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
	public String getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPackageTypeCiq() {
		return packageTypeCiq;
	}
	public void setPackageTypeCiq(String packageTypeCiq) {
		this.packageTypeCiq = packageTypeCiq;
	}
	public String getPackageTypeCus() {
		return packageTypeCus;
	}
	public void setPackageTypeCus(String packageTypeCus) {
		this.packageTypeCus = packageTypeCus;
	}
	public String getPackNum() {
		return packNum;
	}
	public void setPackNum(String packNum) {
		this.packNum = packNum;
	}
	public String getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public String getTransportationMethod() {
		return transportationMethod;
	}
	public void setTransportationMethod(String transportationMethod) {
		this.transportationMethod = transportationMethod;
	}
	public String getShipCode() {
		return shipCode;
	}
	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getDestinationPort() {
		return destinationPort;
	}
	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}
	public String getIeType() {
		return ieType;
	}
	public void setIeType(String ieType) {
		this.ieType = ieType;
	}
	public String getStockFlag() {
		return stockFlag;
	}
	public void setStockFlag(String stockFlag) {
		this.stockFlag = stockFlag;
	}
	public String getBatchNumbers() {
		return batchNumbers;
	}
	public void setBatchNumbers(String batchNumbers) {
		this.batchNumbers = batchNumbers;
	}
	public String getTradeCountryCiq() {
		return tradeCountryCiq;
	}
	public void setTradeCountryCiq(String tradeCountryCiq) {
		this.tradeCountryCiq = tradeCountryCiq;
	}
	public String getTradeCountryCus() {
		return tradeCountryCus;
	}
	public void setTradeCountryCus(String tradeCountryCus) {
		this.tradeCountryCus = tradeCountryCus;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentCodeCiq() {
		return agentCodeCiq;
	}
	public void setAgentCodeCiq(String agentCodeCiq) {
		this.agentCodeCiq = agentCodeCiq;
	}
	public String getAgentNameCiq() {
		return agentNameCiq;
	}
	public void setAgentNameCiq(String agentNameCiq) {
		this.agentNameCiq = agentNameCiq;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getModifyMark() {
		return modifyMark;
	}
	public void setModifyMark(String modifyMark) {
		this.modifyMark = modifyMark;
	}
	public String getCustomsField() {
		return customsField;
	}
	public void setCustomsField(String customsField) {
		this.customsField = customsField;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getReserve1() {
		return reserve1;
	}
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	public String getReserve2() {
		return reserve2;
	}
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	public String getReserve3() {
		return reserve3;
	}
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	public String getReserve4() {
		return reserve4;
	}
	public void setReserve4(String reserve4) {
		this.reserve4 = reserve4;
	}
	public String getReserve5() {
		return reserve5;
	}
	public void setReserve5(String reserve5) {
		this.reserve5 = reserve5;
	}
	
	
}
