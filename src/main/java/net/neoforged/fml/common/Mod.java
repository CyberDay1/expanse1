package net.neoforged.fml.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Minimal compile-time stub of the NeoForge {@code @Mod} annotation. The build
 * excludes this package from the published jar so the real NeoForge annotation
 * remains in control at runtime.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Mod {
    String value();
}
