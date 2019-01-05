package com.roncoo.education.system.feign.web;

import org.springframework.cloud.openfeign.FeignClient;

import com.roncoo.education.system.common.interfaces.web.BossWebsiteRecruit;

/**
 * 招募中心 
 *
 * @author YZJ
 */
@FeignClient(value = "roncoo-education-system-service")
public interface IBossWebsiteRecruit extends BossWebsiteRecruit {

}
