package it.giovi.service.mapper;

import com.example.model.DashboardResponse;
import it.giovi.web.model.PollutionData;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-14T22:03:53+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Ubuntu)"
)
public class MapConverterImpl implements MapConverter {

    @Override
    public DashboardResponse pollutionDataDtoToResponse(PollutionData data) {
        if ( data == null ) {
            return null;
        }

        double co = 0.0d;
        double no = 0.0d;
        double no2 = 0.0d;
        double o3 = 0.0d;
        double so2 = 0.0d;
        double pm2_5 = 0.0d;
        double pm10 = 0.0d;
        double nh3 = 0.0d;

        co = data.getCo();
        no = data.getNo();
        no2 = data.getNo2();
        o3 = data.getO3();
        so2 = data.getSo2();
        pm2_5 = data.getPm2_5();
        pm10 = data.getPm10();
        nh3 = data.getNh3();

        String city = null;
        Integer aqi = null;
        String date = null;

        DashboardResponse dashboardResponse = new DashboardResponse( city, aqi, date, co, no, no2, o3, so2, pm2_5, pm10, nh3 );

        return dashboardResponse;
    }
}
