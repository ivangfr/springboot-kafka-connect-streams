package com.mycompany.storestreams.serde.json;

import com.mycompany.commons.storeapp.json.OrderDetailed;
import org.springframework.kafka.support.serializer.JsonSerde;

public class OrderDetailedJsonSerde extends JsonSerde<OrderDetailed> {
}
