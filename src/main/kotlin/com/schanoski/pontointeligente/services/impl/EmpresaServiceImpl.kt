package com.schanoski.pontointeligente.services.impl

import com.schanoski.pontointeligente.documents.Empresa
import com.schanoski.pontointeligente.repositories.EmpresaRepository
import com.schanoski.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository): EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}