package com.platzi.market.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.market.domain.Customer;
import com.platzi.market.persistence.entity.Cliente;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mappings({
        @Mapping(source = "id", target = "customerId"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "apellidos", target = "lastName"),
        @Mapping(source = "celular", target = "phone"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "correoElectronico", target = "email")
    })
    Customer toCustomer(Cliente cliente);
    @InheritInverseConfiguration
    @Mapping(target = "compras", ignore = true)
    Cliente toCliente(Customer customer);
}
