package com.kosa.resq.domain.vo.car;

import com.kosa.resq.domain.vo.common.MemVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarRezResponseVO {
    private String car_rez_code;
    private Date rez_at;
    private String detail;
    private String end_loc;
    private float est_mileage;
    private String rez_status;
    private Date start_at;
    private int rental_time;
    private String pickup_loc;
    private String return_loc;
    private MemVO memVO;
    private CarVO carVO;
}