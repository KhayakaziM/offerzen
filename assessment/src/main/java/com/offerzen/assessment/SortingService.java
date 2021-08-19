package com.offerzen.assessment;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SortingService {



    public List<Data> getData(SortData sortData){

        int arraysize=sortData.getData().size();
            SortData storeData=new SortData();

            List<SortData> storesData= new ArrayList<>();
            int[] addData = new int[arraysize];
            List<Data> storageData= new ArrayList<Data>();
            if(sortData.getData().size()>0 && sortData.getData()!=null ){
            for(int j=0;j<sortData.getData().size();j++){
                int addSortData = sortData.getData().get(j).getData();
                addData[j]=addSortData;
            }
            int[] sortedData = sortData(addData);
            for(int k=0;k<sortedData.length;k++){
              Data data=new Data();
                int storeElement=0;
                storeElement=sortedData[k];
                data.setData(storeElement);
                storageData.add(data);
                System.out.print(storageData);

            }
        }
        return storageData;
    }


    public int[] sortData(int[] arr){

        if(arr.length<10000){
            bubbleSort(arr);
        }
        return arr;
    }

   public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }



}