## Data Access Layer

public interface ProgramRepository extends JpaRepository<ElementModel, Integer>, // Element and its Primary Key type
    RepositoryExt<ElementModel>{

}
