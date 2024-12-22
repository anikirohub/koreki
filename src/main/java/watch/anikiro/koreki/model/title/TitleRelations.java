package watch.anikiro.koreki.model.title;

import lombok.Data;
import watch.anikiro.koreki.type.title.TitleRelation;

import java.util.EnumMap;
import java.util.List;

@Data
public class TitleRelations {
    private EnumMap<TitleRelation, List<Long>> relations;

    public TitleRelations() {
        this.relations = new EnumMap<>(TitleRelation.class);
    }

    public void addRelation(TitleRelation relation, List<Long> ids) {
        this.relations.put(relation, ids);
    }

    public List<Long> getRelationsByType(TitleRelation relation) {
        return this.relations.getOrDefault(relation, List.of());
    }
}
