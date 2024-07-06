package com.example.login;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CuacaRootModel {
    @SerializedName("city")
    public CuacaCityModel getCityModel;
    @SerializedName("list")
    private List<CuacaListModel> listModelList;

    public CuacaRootModel() {
    }

    public List<CuacaListModel> getListModelList() {
        return listModelList;
    }

    public void setListModelList(List<CuacaListModel> listModelList) {
        this.listModelList = listModelList;
    }

    public CuacaCityModel getGetCityModel() {
        return getCityModel;
    }

    public void setGetCityModel(CuacaCityModel getCityModel) {
        this.getCityModel = getCityModel;
    }
}
