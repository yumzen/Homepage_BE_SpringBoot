package kahlua.KahluaProject.repository;

import kahlua.KahluaProject.domain.apply.Apply;
import kahlua.KahluaProject.domain.apply.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplyRepository extends JpaRepository<Apply, Long> {

    List<Apply> findAllByFirstPreference(Preference first_preference);
    List<Apply> findAllBySecondPreference(Preference second_preference);
    Boolean existsByPhoneNum(String phone_num);
}
