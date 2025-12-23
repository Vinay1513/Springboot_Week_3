package com.week3learning.week3_springboot.hospital_management.dto;

import com.week3learning.week3_springboot.hospital_management.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
