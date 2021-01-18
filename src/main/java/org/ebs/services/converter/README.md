## Conversion Layer


@Component
class SourceToTargetConverter implements Converter<Source, Target>{    // source and target types

    @Override
    public Target convert(Source source) {
        Target target = new Target();
        Utils.copyNotNulls(source, target);

        return target;
    }

}
