package com.cheryl.vermouth;

import com.cheryl.config.VermouthConfiguration;
import com.cheryl.config.VermouthProperties;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Cheryl 769303522@qq.com
 */

public class EnableVermouthClientImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{VermouthConfiguration.class.getName(), VermouthProperties.class.getName(), VermouthGrpcClient.class.getName(), VermouthCancelTask.class.getName()};
    }
}
