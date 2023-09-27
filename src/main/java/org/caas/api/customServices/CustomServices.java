package org.caas.api.customServices;

import lombok.Data;
import org.caas.api.common.model.CommonMetaData;
import org.caas.api.common.model.CommonSpec;
import org.caas.api.common.model.CommonStatus;

/**
 * Custom Services Model 클래스
 *
 * @author REX
 * @version 1.0
 * @since 2018.08.09
 */
@Data
public class CustomServices {

    private String resultCode;
    private CommonMetaData metadata;
    private CommonSpec spec;
    private CommonStatus status;
    private String sourceTypeYaml;

}
