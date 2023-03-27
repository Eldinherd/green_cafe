package base;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
public class UpdateBase extends CreatedBase{
    @Column(name = "update_at")
    @UpdateTimestamp
    private LocalDateTime updateAt;

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }
}
