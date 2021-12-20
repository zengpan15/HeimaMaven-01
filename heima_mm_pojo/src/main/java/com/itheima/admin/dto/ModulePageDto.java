package com.itheima.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModulePageDto {
    Integer currentPage;
    Integer pageSize;
    String name;
    Integer ctype;
}
