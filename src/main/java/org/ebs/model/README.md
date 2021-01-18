## Model Layer

@Entity
@Table(name = "tablename", schema = "tableschema")
@Getter @Setter @ToString
public class ExperimentModel extends Auditable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column    //columns matching the property's name do not require name mapping
    private String simple;

    @Column(name = "multi_word")
    private String multiWord;

}