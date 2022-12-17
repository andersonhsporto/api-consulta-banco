package br.com.banco.service;

import br.com.banco.DTO.AccountDTO;
import br.com.banco.domain.AccountEntity;
import br.com.banco.repository.AccountRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;

  public ResponseEntity<?> getAllAccount() {
    List<AccountEntity> accountEntityList = accountRepository.findAll();

    return ResponseEntity.ok(AccountDTO.fromEntityList(accountEntityList));
  }

}