package api.StaffHub.Entities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.time.YearMonth;
import java.sql.Date;


//essa classe é um conversor, não uma entidade
@Converter(autoApply = true)
public class YearMonthAttributeConverter implements AttributeConverter<YearMonth, Date> {
    @Override
    public Date convertToDatabaseColumn(YearMonth attribute) {
        return attribute != null ? java.sql.Date.valueOf(attribute.atDay(1)) : null;
    }

    @Override
    public YearMonth convertToEntityAttribute(Date dbData) {
        return dbData != null ? YearMonth.from(dbData.toLocalDate()) : null;
    }
}