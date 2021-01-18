## Service Layer


### Interface

public interface ElementService {

    Element findElement( int ElementId );

    Page<Element> findElements( Pageable page );

}

### Implementation

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor(onConstructor = @__({ @Autowired }))
class ExperimentServiceImpl implements ExperimentService {

    //beans to be injected (initialized)
    private final ConversionService converter; // all services use this
    private final SomeRepository someRepository;


        @Override
    public Experiment findExperiment(int experimentId) {
        // convert to model objects
        // apply logic and use repositories
        // convert to transfer object and return them
    }

    @Override
    public Page<Experiment> findExperiments(Pageable page) {

    }
}

### Notes

Don forget to add

    @Transactional(readOnly = false)

for methods that modify the database
