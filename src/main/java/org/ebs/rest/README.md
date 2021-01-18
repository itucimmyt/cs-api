## Resource (Rest) Layer

### Interface

@Validated
public interface ElementResource {
    BrResponse<TransferObject> findElement( int elementDbId );
    BrPagedResponse<TransferObject> findElements( Pageable page );
}


### Implementetion

import static org.ebs.util.brapi.BrapiResponseBuilder.forData;

@RestController
@RequestMapping("rest")
@RequiredArgsConstructor
class ElementResourceImpl implements ElementResource {

    //beans to be injected (initialized)
    private final SomeService someService;

    @Override
    @GetMapping("element/{elementDbId}")
    public BrResponse<TransferObject> findElement( @PathVariable int elementDbId) {
        return forData(someService.findElement(elementDbId))
        .withStatusSuccess()
        .build();
    }

    @Override
    @GetMapping("element")
    public BrPagedResponse<TransferObject> findElements(Pageable page) {
        return forData(someService.findElements(page))
            .withStatusSuccess()
            .build();
    }


}