package bd.ac.seu.my.vaddindemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieCategory {

    @Id
    @GeneratedValue
    private int categoryId;
    private String categoryName;
}
